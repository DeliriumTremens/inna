package com.inna.sinai.web.view.controller.core.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.inna.sinai.common.exception.core.SystemException;
import com.inna.sinai.web.bean.criteria.UserCriteria;
import com.inna.sinai.web.bean.vo.MasterUser;
import com.inna.sinai.web.service.admin.UserAdminService;
import com.inna.sinai.web.view.controller.CommonController;

import static com.inna.sinai.web.constant.Literals.*;

@Controller
@SessionAttributes("lastSearchParams")
public class UserAdministrationController  extends CommonController {
	
  private UserAdminService service;
	
  public void setService(UserAdminService service) {
	this.service = service;
  }

  @RequestMapping("/usersAdministration.do")
  public String  setupSearchUser(ModelMap model){
    model.addAttribute("profiles", catService.getProfileDAO().getAll()); 
    model.addAttribute("searchParams", new UserCriteria());
    return "admin/user/searchUser";
  }
  
  @RequestMapping("/usersAdministration/seachUsers.do")
  public String  searchUser(@ModelAttribute("searchParams") UserCriteria
		                                 searchParams, ModelMap model) {
	model.addAttribute("lastSearchParams", searchParams);
    model.addAttribute("masterUsers", service.searchMasterUsers(searchParams)); 
    return "admin/user/_userTable";
  }

  @RequestMapping("/usersAdministration/setupDeleteUser.do")
  public String  setupDeleteUser(ModelMap model) {
	  return "admin/user/_deleteUser";
  }
  
  @RequestMapping("/usersAdministration/deleteUsers.do")
  public String  deleteUser(@RequestParam String chainIds, ModelMap model) {
	service.deleteMasterUsers(chainIds);
	model.addAttribute("infMessage", "msg.deleteOK");
	return searchUser((UserCriteria) model.get("lastSearchParams"), model);
  } 
  
  @RequestMapping("/usersAdministration/setupCreateUser.do")
  public String  setupCreateUser(ModelMap model) {
	  model.addAttribute("profiles", catService.getProfileDAO().getAll()); 
	  model.addAttribute("newMasterUser", new MasterUser());
	  return "admin/user/_createUser";
  }
  
  @RequestMapping("/usersAdministration/createUser.do")
  public String  createUser(@ModelAttribute MasterUser newMasterUser
		                  , ModelMap model) throws SystemException {
	  UserCriteria searchUserParams = new UserCriteria(SEARCH_TYPE_ID_MAIL
			                         , newMasterUser.getUser().getMail());
	  if(service.existUserMail(newMasterUser.getUser().getMail())){
		  model.addAttribute("errMessage", "err.duplicateMail");
	  } else if(service.existUserNickName(newMasterUser.getCredential()
			                                          .getNickName())){
		  model.addAttribute("errMessage", "err.duplicateNick");
	  } else {
	      service.insertMasterUser(newMasterUser);
	      model.addAttribute("infMessage", "msg.insertOK");
	  }
	  return searchUser(searchUserParams, model);
  }
  
  @RequestMapping("/usersAdministration/setupUpdateUserInformation.do")
  public String  setupUpdateUser(@RequestParam Integer userId, ModelMap model) {
	  model.addAttribute("masterUser", service.getMasterUser(userId));
	  model.addAttribute("profiles", catService.getProfileDAO().getAll());
	  model.addAttribute("businessUnits", catService.getBusinessUnitDAO().getAll()); 
	  model.addAttribute("employeeRols", catService.getEmployeeRolDAO().getAll()); 
	  return "admin/user/_editUser";
  }
  
  @RequestMapping("/usersAdministration/updateUserInformation.do")
  public String  updateUser(@ModelAttribute MasterUser masterUser, ModelMap model) {
	  service.updateMasterUserInformation(masterUser);
	  model.addAttribute("infMessage", "msg.updateOK");
	  return searchUser((UserCriteria) model.get("lastSearchParams"), model);
  }

}

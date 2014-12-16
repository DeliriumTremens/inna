package com.inna.sinai.web.view.controller.core.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.inna.sinai.common.exception.core.SystemException;
import com.inna.sinai.web.bean.vo.MasterUser;
import com.inna.sinai.web.service.admin.UserAdminService;
import com.inna.sinai.web.view.controller.CommonController;

@Controller
@RequestMapping("usersAdministration")
public class UserAdministrationController  extends CommonController {
	
  private UserAdminService service;
	
  public void setService(UserAdminService service) {
	this.service = service;
  }

  @RequestMapping("/setup.do")
  public String  setup(ModelMap model){
    model.addAttribute("profiles", catService.getProfileDAO().getAll()); 
    model.addAttribute("toSearch", new MasterUser());
    return "admin/user/searchUser";
  }
  
  @RequestMapping("/seach.do")
  public String  search(MasterUser toSearch, ModelMap model) {
    model.addAttribute("masterUsers", service.searchMasterUsers(toSearch)); 
    return "admin/user/_userTable";
  }

  @RequestMapping("/setupDelete.do")
  public String  setupDelete(ModelMap model) {
	  return "admin/user/_deleteUser";
  }
  
  @RequestMapping("/delete.do")
  public String  delete(@RequestParam String chainIds, ModelMap model) {
	service.deleteMasterUsers(chainIds);
	model.addAttribute("infMessage", "msg.deleteOK");
	return search(null, model);
  } 
  
  @RequestMapping("/setupCreate.do")
  public String  setupCreate(ModelMap model) {
	  model.addAttribute("profiles", catService.getProfileDAO().getAll()); 
	  model.addAttribute("newMasterUser", new MasterUser());
	  return "admin/user/_createUser";
  }
  
  @RequestMapping("/create.do")
  public String  create(@ModelAttribute MasterUser newMasterUser
		                  , ModelMap model) throws SystemException {
	  if(service.existUserMail(newMasterUser.getUser().getMail())){
		  model.addAttribute("errMessage", "err.duplicateMail");
	  } else if(service.existUserNickName(newMasterUser.getCredential()
			                                          .getNickName())){
		  model.addAttribute("errMessage", "err.duplicateNick");
	  } else {
	      service.insertMasterUser(newMasterUser);
	      model.addAttribute("infMessage", "msg.insertOK");
	  }
	  return search(newMasterUser, model);
  }
  
  @RequestMapping("/setupUpdate.do")
  public String  setupUpdateUser(@RequestParam Integer userId, ModelMap model) {
	  model.addAttribute("masterUser", service.getMasterUser(userId));
	  model.addAttribute("profiles", catService.getProfileDAO().getAll());
	  model.addAttribute("businessUnits", catService.getBusinessUnitDAO().getAll()); 
	  model.addAttribute("employeeRols", catService.getEmployeeRolDAO().getAll()); 
	  return "admin/user/_editUser";
  }
  
  @RequestMapping("/update.do")
  public String  update(@ModelAttribute MasterUser masterUser, ModelMap model) {
	  service.updateMasterUserInformation(masterUser);
	  model.addAttribute("infMessage", "msg.updateOK");
	  return search(masterUser, model);
  }

}

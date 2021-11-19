package fr.isika.cda11.ohana.project.common.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import fr.isika.cda11.ohana.project.common.dto.AccountDto;
import fr.isika.cda11.ohana.project.common.dto.AddressDto;
import fr.isika.cda11.ohana.project.common.dto.ContactDto;
import fr.isika.cda11.ohana.project.common.dto.InfoPersonDto;
import fr.isika.cda11.ohana.project.common.service.AccountService;
import fr.isika.cda11.ohana.project.common.service.InfoPersonService;
import fr.isika.cda11.ohana.project.enumclass.EnumRole;

@ManagedBean
@SessionScoped
public class AccountController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1373993544070458079L;

	@Inject 
	AccountService accountService;
	@Inject
	InfoPersonService infoPersonService;

	//ATTRIBUTS
	private AccountDto newAccountDto = new AccountDto();
	private InfoPersonDto newInfoPersonDto = new InfoPersonDto();
	private ContactDto newContactDto = new ContactDto();
	private AddressDto newAddressDto = new AddressDto();
	

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public InfoPersonService getInfoPersonService() {
		return infoPersonService;
	}

	public void setInfoPersonService(InfoPersonService infoPersonService) {
		this.infoPersonService = infoPersonService;
	}

	public AccountDto getNewAccountDto() {
		return newAccountDto;
	}

	public void setNewAccountDto(AccountDto newAccountDto) {
		this.newAccountDto = newAccountDto;
	}

	public InfoPersonDto getNewInfoPersonDto() {
		return newInfoPersonDto;
	}

	public void setNewInfoPersonDto(InfoPersonDto newInfoPersonDto) {
		this.newInfoPersonDto = newInfoPersonDto;
	}

	public ContactDto getNewContactDto() {
		return newContactDto;
	}

	public void setNewContactDto(ContactDto newContactDto) {
		this.newContactDto = newContactDto;
	}

	public AddressDto getNewAddressDto() {
		return newAddressDto;
	}

	public void setNewAddressDto(AddressDto newAddressDto) {
		this.newAddressDto = newAddressDto;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//CREATE AN ACCOUNT

	public String createnewAccount() {
		
		accountService.createAccountervice(newAccountDto, newInfoPersonDto, newContactDto, newAddressDto);
		newAccountDto = new AccountDto();
		newInfoPersonDto = new InfoPersonDto();
		newContactDto = new ContactDto();
		return "accountvalidate";
	}

	


}


package fr.isika.cda11.ohana.project.membership.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import fr.isika.cda11.ohana.project.common.dto.AssociationDto;
import fr.isika.cda11.ohana.project.membership.dto.MemberShipManageDto;
import fr.isika.cda11.ohana.project.membership.repository.MemberShipManageRepos;

@Stateless
public class MemberShipManageService {

	@Inject
	private MemberShipManageRepos mbsr;

	// CREATE
	public MemberShipManageDto createMembershipManage(MemberShipManageDto membershipManage,
			AssociationDto associationDto) {
		membershipManage.setAssociation(associationDto);
		return mbsr.createMembershipManage(membershipManage);
	}

	// READ

	public MemberShipManageDto findMembershipManageByIdService(long id) {
		return mbsr.findMembershipManageRepos(id);
	}

	// UPDATE
	public MemberShipManageDto updateMembershipManageService(MemberShipManageDto membershipManageToUpdate) {
		mbsr.updateMembershipManageRepos(membershipManageToUpdate);
		return findMembershipManageByIdService(membershipManageToUpdate.getId());
	}

	// DELETE
	public void deleteMembershipManageService(long id) {
		mbsr.deleteMembershipManageRepos(id);
	}

}
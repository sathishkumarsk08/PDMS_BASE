package com.msp.service.msp_pms;

import com.msp.mosip_pms.model.MstRoleGroup;
import com.msp.mosip_pms.repository.MstRoleGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MstRoleGroupService implements MstRoleGroupRepository {
	
	@Autowired
	MstRoleGroupRepository mstRoleGroupRepository;




	@Override
	public Integer groupId() {
		// TODO Auto-generated method stub
		return mstRoleGroupRepository.groupId();
	}

	@Override
	public Iterable<MstRoleGroup> listRoleToGroup() {
		// TODO Auto-generated method stub
		return mstRoleGroupRepository.listRoleToGroup();
	}

	@Override
	public MstRoleGroup findbygroupId(Integer i) {
		// TODO Auto-generated method stub
		return mstRoleGroupRepository.findbygroupId(i);
	}

	@Override
	public List findByGroupName(String groupName) {
		// TODO Auto-generated method stub
		return mstRoleGroupRepository.findByGroupName(groupName);
	}


	@Override
	public <S extends MstRoleGroup> S save(S entity) {
		return null;
	}

	@Override
	public <S extends MstRoleGroup> Iterable<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Override
	public Optional<MstRoleGroup> findById(Integer integer) {
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer integer) {
		return false;
	}

	@Override
	public Iterable<MstRoleGroup> findAll() {
		return null;
	}

	@Override
	public Iterable<MstRoleGroup> findAllById(Iterable<Integer> integers) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void deleteById(Integer integer) {

	}

	@Override
	public void delete(MstRoleGroup entity) {

	}

	@Override
	public void deleteAll(Iterable<? extends MstRoleGroup> entities) {

	}

	@Override
	public void deleteAll() {

	}
}

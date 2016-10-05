package com.sone.freshman.bu.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sone.freshman.bu.AddressManager;
import com.sone.freshman.utils.Messages;
import com.sone.freshman.vo.AddressVO;
import com.standone.exceptions.SoneDataException;
import com.standone.hbr.dao.AddressDao;
import com.standone.hbr.vo.AddressDTO;
public class AddressManagerImpl implements AddressManager{
	
	@Autowired AddressDao dao;	
	@Override
	public List<AddressVO> getList() {
		List<AddressDTO> dtoList = null;
		List<AddressVO> voList = null;
		try {
			dtoList=dao.getList();
			voList=new ArrayList<AddressVO>();
			toVOList(dtoList, voList);
		} catch (SoneDataException e) {
			e.printStackTrace();
		}
		return voList;
	}
	@Override
	public Messages save(AddressVO vo) {	
		AddressDTO dto=new AddressDTO();
		Messages rtn=new Messages();
		toDTO(vo, dto);
		try {
			com.standone.hbr.util.Messages msg=dao.save(dto);
			rtn.setMessageType(msg.getMessageType());
			for(String m:msg){
				rtn.add(m);
			}
		} catch (SoneDataException e) {
			e.printStackTrace();
			rtn.setMessageType("EXCEP");
			rtn.add(e.getMessage());
		}
		return rtn;
	}
	@Override
	public Messages update(AddressVO vo) {	
		AddressDTO dto=new AddressDTO();
		Messages rtn=new Messages();
		toDTO(vo, dto);
		try {
			com.standone.hbr.util.Messages msg=dao.update(dto);
			rtn.setMessageType(msg.getMessageType());
			for(String m:msg){
				rtn.add(m);
			}
		} catch (SoneDataException e) {
			e.printStackTrace();
			rtn.setMessageType("EXCEP");
			rtn.add(e.getMessage());
		}
		return rtn;
	}
	@Override
	public AddressVO get(String id) {
		AddressVO vo=new AddressVO();
		AddressDTO dto=null;
		try {
			dto = dao.get(id);
			toVO(dto, vo);
		} catch (SoneDataException e) {
			e.printStackTrace();
		}
		return vo;
	}
	private void toVO(AddressDTO dto,AddressVO vo){
		vo.setId(dto.getId());
		vo.setStreet(dto.getStreet());
		vo.setSuiteApt(dto.getSuiteApt());
		vo.setCity(dto.getCity());
		vo.setState(dto.getState());
		vo.setCountry(dto.getCountry());			
		vo.setPhoneHome(dto.getPhoneHome());
		vo.setPhoneMobile(dto.getPhoneMobile());
		vo.setPhoneOffice(dto.getPhoneOffice());
		vo.setExtension(dto.getExtension());
		vo.setFax(dto.getFax());
		vo.setType(dto.getType());
		vo.setZip(dto.getZip());
	}
	private void toDTO(AddressVO vo,AddressDTO dto){
		dto.setId(vo.getId());
		dto.setStreet(vo.getStreet());
		dto.setSuiteApt(vo.getSuiteApt());
		dto.setCity(vo.getCity());
		dto.setState(vo.getState());
		dto.setCountry(vo.getCountry());			
		dto.setPhoneHome(vo.getPhoneHome());
		dto.setPhoneMobile(vo.getPhoneMobile());
		dto.setPhoneOffice(vo.getPhoneOffice());
		dto.setExtension(vo.getExtension());
		dto.setFax(vo.getFax());
		dto.setType(vo.getType());
		dto.setZip(vo.getZip());
	}
	private void toVOList(List<AddressDTO> dtoList,List<AddressVO> voList){
		AddressVO vo=null;
		if (dtoList!=null && !dtoList.isEmpty()){
			for(AddressDTO dto:dtoList){
				vo = new AddressVO();
				toVO(dto, vo);
				voList.add(vo);
			}
		}
	}
}

package com.dipen.radius.service;

import java.util.List;

import com.dipen.radius.domain.Relative;


public interface RelativeService {

	List<Relative> getRelatives() throws Exception;
	Relative createRelative(Relative user) throws Exception;
	public String getMyRelatives();
}

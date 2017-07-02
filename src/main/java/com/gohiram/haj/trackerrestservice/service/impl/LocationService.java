package com.gohiram.haj.trackerrestservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gohiram.haj.trackerrestservice.dao.ILocationDao;
import com.gohiram.haj.trackerrestservice.exception.TrackerException;
import com.gohiram.haj.trackerrestservice.service.ILocationService;

@Service
public class LocationService implements ILocationService {

	@Autowired
	private ILocationDao locationDao;
	
	@Override
	public boolean addLocation(String id, String location) throws TrackerException {
		
		return locationDao.addLocation(id, location);
	}

	@Override
	public List<String> getRecentLocations(String id) throws TrackerException {
		
		return locationDao.getRecentLocations(id);
	}

	@Override
	public String getRecentLocation(String id) throws TrackerException {
		
		return locationDao.getRecentLocation(id);
	}

	
}

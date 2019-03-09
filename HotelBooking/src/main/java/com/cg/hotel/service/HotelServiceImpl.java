package com.cg.hotel.service;

import com.cg.hotel.dao.*;

public class HotelServiceImpl implements HotelService{

	HotelDao hotelDao=new HotelDaoImpl();
	public void bookRoom() throws Exception {
		hotelDao.bookRoom();
	}

	public void checkStatus() throws Exception {
		hotelDao.checkStatus();
	}

}

package com.geolocation.api.config.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Base64;
import java.util.Calendar;

import com.geolocation.api.response.ResponseDTO;


public class SpringJwtUtil
{
	

	public static ResponseDTO createResponse(String message, Integer error)
	{
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setErrorcode(error);
		responseDTO.setErrormsg(message);
		responseDTO.setTimestamp(
				DateUtil.getDateTime(SpringJwtConstant.GENERAL_DATE_FORMAT, Calendar.getInstance().getTime()));

		return responseDTO;
	}

	public static ResponseDTO createResponseSuccess()
	{
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setErrorcode(0);
		responseDTO.setErrormsg("success");
		responseDTO.setTimestamp(
				DateUtil.getDateTime(SpringJwtConstant.GENERAL_DATE_FORMAT, Calendar.getInstance().getTime()));

		return responseDTO;
	}

	public static ResponseDTO createResponseFailed()
	{
		ResponseDTO responseDTO = new ResponseDTO();
		responseDTO.setErrorcode(-1);
		responseDTO.setErrormsg("failed");
		responseDTO.setTimestamp(
				DateUtil.getDateTime(SpringJwtConstant.GENERAL_DATE_FORMAT, Calendar.getInstance().getTime()));

		return responseDTO;
	}




	
}

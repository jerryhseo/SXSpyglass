/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sx.spyglass.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.sx.spyglass.service.base.ScienceAppLocalServiceBaseImpl;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.sx.spyglass.model.ScienceApp",
	service = AopService.class
)
public class ScienceAppLocalServiceImpl extends ScienceAppLocalServiceBaseImpl {
	
	public JSONArray getScienceAppList(String appType) {
		JSONArray availables = JSONFactoryUtil.createJSONArray();
		
		JSONObject item = JSONFactoryUtil.createJSONObject();
		item.put( "id", 123456);
		JSONObject displayName = JSONFactoryUtil.createJSONObject();
		displayName.put("en-US", "Text Viewer");
		displayName.put("ko-KR", "Text Viewer");
		item.put( "displayName", displayName);
		availables.put(item);
		
		item = JSONFactoryUtil.createJSONObject();
		item.put( "id", 234567);
		displayName = JSONFactoryUtil.createJSONObject();
		displayName.put("en-US", "Structured Data Editor");
		displayName.put("ko-KR", "Structured Data Editor");
		item.put( "displayName", displayName);
		availables.put(item);
		
		item = JSONFactoryUtil.createJSONObject();
		item.put( "id", 345678);
		displayName = JSONFactoryUtil.createJSONObject();
		displayName.put("en-US", "Image Viewer");
		displayName.put("ko-KR", "Image Viewer");
		item.put( "displayName", displayName);
		availables.put(item);
		
		item = JSONFactoryUtil.createJSONObject();
		item.put( "id", 456789);
		displayName = JSONFactoryUtil.createJSONObject();
		displayName.put("en-US", "Text Editor");
		displayName.put("ko-KR", "Text Editor");
		item.put( "displayName", displayName);
		availables.put(item);
		
		item = JSONFactoryUtil.createJSONObject();
		item.put( "id", 567890);
		displayName = JSONFactoryUtil.createJSONObject();
		displayName.put("en-US", "Image Editor");
		displayName.put("ko-KR", "Image Editor");
		item.put( "displayName", displayName);
		availables.put(item);
		
		return availables;
	}
	
	public JSONObject getPseudoScienceApp( int scienceAppId) {
		JSONObject item = JSONFactoryUtil.createJSONObject();
		JSONObject displayName = JSONFactoryUtil.createJSONObject();
		
		switch( scienceAppId ) {
			case 123456:{
				item.put( "id", 123456);
				
				displayName.put("en-US", "Text Viewer");
				displayName.put("ko-KR", "Text Viewer");
				item.put( "displayName", displayName);
				
				break;
			}
			case 234567:{
				item.put( "id", 234567);
				displayName.put("en-US", "Structured Data Editor");
				displayName.put("ko-KR", "Structured Data Editor");
				item.put( "displayName", displayName);
				
				break;
			}
			case 345678:{
				item.put( "id", 345678);
				displayName.put("en-US", "Image Viewer");
				displayName.put("ko-KR", "Image Viewer");
				item.put( "displayName", displayName);
				
				break;
			}
			case 456789:{
				item.put( "id", 456789);
				displayName.put("en-US", "Text Editor");
				displayName.put("ko-KR", "Text Editor");
				item.put( "displayName", displayName);
				
				break;
			}
			case 567890:{
				item.put( "id", 567890);
				displayName.put("en-US", "Image Editor");
				displayName.put("ko-KR", "Image Editor");
				item.put( "displayName", displayName);
				
				break;
			}
		}
		
		return item;
	}
}
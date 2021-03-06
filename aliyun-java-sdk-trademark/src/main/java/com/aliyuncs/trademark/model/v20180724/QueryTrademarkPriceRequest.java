/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryTrademarkPriceRequest extends RpcAcsRequest<QueryTrademarkPriceResponse> {
	
	public QueryTrademarkPriceRequest() {
		super("Trademark", "2018-07-24", "QueryTrademarkPrice", "trademark");
	}

	private String tmName;

	private String tmIcon;

	private String orderData;

	private Integer type;

	private Long userId;

	public String getTmName() {
		return this.tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
		if(tmName != null){
			putQueryParameter("TmName", tmName);
		}
	}

	public String getTmIcon() {
		return this.tmIcon;
	}

	public void setTmIcon(String tmIcon) {
		this.tmIcon = tmIcon;
		if(tmIcon != null){
			putQueryParameter("TmIcon", tmIcon);
		}
	}

	public String getOrderData() {
		return this.orderData;
	}

	public void setOrderData(String orderData) {
		this.orderData = orderData;
		if(orderData != null){
			putQueryParameter("OrderData", orderData);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId.toString());
		}
	}

	@Override
	public Class<QueryTrademarkPriceResponse> getResponseClass() {
		return QueryTrademarkPriceResponse.class;
	}

}

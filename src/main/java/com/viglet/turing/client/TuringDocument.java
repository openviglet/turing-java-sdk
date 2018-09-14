package com.viglet.turing.client;

import org.json.JSONException;
import org.json.JSONObject;

public class TuringDocument {

	private JSONObject content;

	public Object getFieldValue(String field) {

		try {
			return content.getJSONObject("fields").get(field);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public JSONObject getContent() {
		return content;
	}

	public void setContent(JSONObject content) {
		this.content = content;
	}

}
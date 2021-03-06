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

package com.aliyuncs.qualitycheck.transform.v20160801;

import com.aliyuncs.qualitycheck.model.v20160801.UploadAudioData4PreResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadAudioData4PreResponseUnmarshaller {

	public static UploadAudioData4PreResponse unmarshall(UploadAudioData4PreResponse uploadAudioData4PreResponse, UnmarshallerContext context) {
		
		uploadAudioData4PreResponse.setRequestId(context.stringValue("UploadAudioData4PreResponse.requestId"));
		uploadAudioData4PreResponse.setSuccess(context.booleanValue("UploadAudioData4PreResponse.success"));
		uploadAudioData4PreResponse.setCode(context.stringValue("UploadAudioData4PreResponse.code"));
		uploadAudioData4PreResponse.setMessage(context.stringValue("UploadAudioData4PreResponse.message"));
		uploadAudioData4PreResponse.setData(context.stringValue("UploadAudioData4PreResponse.data"));
	 
	 	return uploadAudioData4PreResponse;
	}
}
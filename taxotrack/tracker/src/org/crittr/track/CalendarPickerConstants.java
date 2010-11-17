/*
 * Copyright (C) 2010 Karl Ostmo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.crittr.track;

import android.content.ContentResolver;
import android.provider.BaseColumns;

public class CalendarPickerConstants {

	public static String ANDROID_CALENDAR_AUTHORITY_1_0 = "calendar";
	public static String ANDROID_CALENDAR_AUTHORITY_2_0 = "com.android.calendar";
	
	public static String ANDROID_CALENDAR_PROVIDER_PATH_CALENDARS = "calendars";
	public static String ANDROID_CALENDAR_PROVIDER_PATH_EVENTS = "events";
	
	
	public static final class CalendarDatePicker {

		public static String CONTENT_TYPE_DATETIME = "text/datetime";
		
		/** Date picker Intent extras */
		public static final class IntentExtras {
			
			/** an ISO 8601 date string */
			public static String INTENT_EXTRA_DATETIME = "datetime";
			
			/** A long */
			public static String INTENT_EXTRA_EPOCH = "epoch";
		}
	}
	

	public static final String CONTENT_TYPE_BASE_SINGLE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/";
	public static final String CONTENT_TYPE_BASE_MULTIPLE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/";


	public static final class CalendarEventPicker {

		private static final String VND_TYPE_DECLARATION = "event";

		// ==== CONTENT TYPES ====
		public static final String CONTENT_TYPE_ITEM_CALENDAR_EVENT = CONTENT_TYPE_BASE_SINGLE + VND_TYPE_DECLARATION;
		public static final String CONTENT_TYPE_CALENDAR_EVENT = CONTENT_TYPE_BASE_MULTIPLE + VND_TYPE_DECLARATION;


		/** Calendar event Intent extras */
		public static final class IntentExtras {
			public static final String EXTRA_EVENT_IDS = "org.openintents.calendarpicker.intent.extra.EVENT_IDS";
			public static final String EXTRA_EVENT_TIMESTAMPS = "org.openintents.calendarpicker.intent.extra.EVENT_TIMESTAMPS";
			public static final String EXTRA_EVENT_TITLES = "org.openintents.calendarpicker.intent.extra.EVENT_TITLES";

			public static final String EXTRA_CALENDAR_ID = "calendar_id";
		}
		
		/** Columns to supply when implementing a ContentProvider for events */
		public static final class ContentProviderColumns implements BaseColumns {
			public static final String COLUMN_EVENT_TITLE = "title";
			public static final String COLUMN_EVENT_QUANTITY = "quantity";
			public static final String COLUMN_EVENT_TIMESTAMP = "dtstart";
			public static final String COLUMN_EVENT_CALENDAR_ID = "calendar_id";
		}
	}
}

/*
 * Copyright (C) 2026 Sonicle S.r.l.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation with the addition of the following permission
 * added to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED
 * WORK IN WHICH THE COPYRIGHT IS OWNED BY SONICLE, SONICLE DISCLAIMS THE
 * WARRANTY OF NON INFRINGEMENT OF THIRD PARTY RIGHTS.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * You can contact Sonicle S.r.l. at email address sonicle[at]sonicle[dot]com
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * Sonicle logo and Sonicle copyright notice. If the display of the logo is not
 * reasonably feasible for technical reasons, the Appropriate Legal Notices must
 * display the words "Copyright (C) 2026 Sonicle S.r.l.".
 */
package com.sonicle.webtop.mail.model;

/**
 * Pointer to an existing calendar event that matches the UID carried by an
 * inbound iTIP attachment. Carried inside {@link CalendarPartInfo}; null when
 * the UID is not yet known in the user's calendars.
 */
public class MatchedEventInfo {

	private final String eventInstanceId;
	private final Integer calendarId;
	private final String calendarName;
	private final Integer currentSequence;
	private final boolean isOrganizer;
	private final boolean isOwner;

	public MatchedEventInfo(String eventInstanceId, Integer calendarId, String calendarName,
			Integer currentSequence, boolean isOrganizer, boolean isOwner) {
		this.eventInstanceId = eventInstanceId;
		this.calendarId = calendarId;
		this.calendarName = calendarName;
		this.currentSequence = currentSequence;
		this.isOrganizer = isOrganizer;
		this.isOwner = isOwner;
	}

	public String getEventInstanceId() {
		return eventInstanceId;
	}

	public Integer getCalendarId() {
		return calendarId;
	}

	public String getCalendarName() {
		return calendarName;
	}

	public Integer getCurrentSequence() {
		return currentSequence;
	}

	public boolean isOrganizer() {
		return isOrganizer;
	}

	public boolean isOwner() {
		return isOwner;
	}
}

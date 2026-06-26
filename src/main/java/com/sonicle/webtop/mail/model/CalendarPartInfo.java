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

import java.util.Date;

/**
 * Parsed view of one {@code text/calendar} (or {@code application/ics})
 * attachment on a message. Populated server-side by {@code MailManager}
 * during {@code getMessage} so the client can render an iTIP banner without
 * fetching or parsing the ICS bytes itself.
 *
 * <p>Field semantics:
 * <ul>
 *   <li>{@code method} — iTIP METHOD value (REQUEST, REPLY, CANCEL, COUNTER, PUBLISH, REFRESH)
 *   <li>{@code userResponseStatus} — populated only when the current user is
 *       listed as an attendee. Values: {@code NA}, {@code AC}, {@code DE}, {@code TE}
 *   <li>{@code matchExistingEvent} — non-null when {@code eventUid} resolves
 *       to an existing event in the user's calendars
 *   <li>{@code replyAttendee} / {@code replyStatus} — populated only when
 *       {@code method == REPLY} (the attendee whose response this REPLY carries)
 * </ul>
 */
public class CalendarPartInfo {

	private final int attachmentIndex;
	private final String method;
	private final String eventUid;
	private final int sequence;
	private final String summary;
	private final String location;
	private final Date startsAt;
	private final Date endsAt;
	private final boolean allDay;
	private final String timezone;
	private final String organizerCN;
	private final String organizerEmail;
	private final boolean userIsAttendee;
	private final String userResponseStatus;
	private final MatchedEventInfo matchExistingEvent;
	private final String replyAttendeeCN;
	private final String replyAttendeeEmail;
	private final String replyStatus;
	private final String comment;

	public CalendarPartInfo(
			int attachmentIndex, String method, String eventUid, int sequence,
			String summary, String location, Date startsAt, Date endsAt,
			boolean allDay, String timezone,
			String organizerCN, String organizerEmail,
			boolean userIsAttendee, String userResponseStatus,
			MatchedEventInfo matchExistingEvent,
			String replyAttendeeCN, String replyAttendeeEmail, String replyStatus,
			String comment) {
		this.attachmentIndex = attachmentIndex;
		this.method = method;
		this.eventUid = eventUid;
		this.sequence = sequence;
		this.summary = summary;
		this.location = location;
		this.startsAt = startsAt;
		this.endsAt = endsAt;
		this.allDay = allDay;
		this.timezone = timezone;
		this.organizerCN = organizerCN;
		this.organizerEmail = organizerEmail;
		this.userIsAttendee = userIsAttendee;
		this.userResponseStatus = userResponseStatus;
		this.matchExistingEvent = matchExistingEvent;
		this.replyAttendeeCN = replyAttendeeCN;
		this.replyAttendeeEmail = replyAttendeeEmail;
		this.replyStatus = replyStatus;
		this.comment = comment;
	}

	public int getAttachmentIndex() { return attachmentIndex; }
	public String getMethod() { return method; }
	public String getEventUid() { return eventUid; }
	public int getSequence() { return sequence; }
	public String getSummary() { return summary; }
	public String getLocation() { return location; }
	public Date getStartsAt() { return startsAt; }
	public Date getEndsAt() { return endsAt; }
	public boolean isAllDay() { return allDay; }
	public String getTimezone() { return timezone; }
	public String getOrganizerCN() { return organizerCN; }
	public String getOrganizerEmail() { return organizerEmail; }
	public boolean isUserIsAttendee() { return userIsAttendee; }
	public String getUserResponseStatus() { return userResponseStatus; }
	public MatchedEventInfo getMatchExistingEvent() { return matchExistingEvent; }
	public String getReplyAttendeeCN() { return replyAttendeeCN; }
	public String getReplyAttendeeEmail() { return replyAttendeeEmail; }
	public String getReplyStatus() { return replyStatus; }
	public String getComment() { return comment; }
}

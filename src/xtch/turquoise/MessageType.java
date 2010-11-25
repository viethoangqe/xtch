/*
 * Copyright 2010 the original author or authors.
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
package xtch.turquoise;

public class MessageType {
  public static final MessageType TYPE = new MessageType();

  public static final String LOGON = "A";
  public static final String LOGON_REPLY = "B";
  public static final String LOGOUT = "5";
  public static final String HEARTBEAT = "0";

  private MessageType() {
  }
}

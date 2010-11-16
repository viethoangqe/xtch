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
package xtch.turquoise.types;

import java.nio.ByteBuffer;
import xtch.types.AbstractType;

public class UnsignedInt16 extends AbstractType<Integer> {
  public static final UnsignedInt16 TYPE = new UnsignedInt16();

  @Override public void encode(ByteBuffer buffer, Integer value, int length) {
    writeAsLittleEndian(buffer, value);
  }

  @Override public Integer decode(ByteBuffer buffer, int length) {
    return readAsLittleEndian(buffer);
  }

  private void writeAsLittleEndian(ByteBuffer buffer, long value) {
    buffer.put((byte) (value >> 0  & 0xff));
    buffer.put((byte) (value >> 8  & 0xff));
  }

  private int readAsLittleEndian(ByteBuffer buffer) {
    int result = 0;
    result |= (buffer.get() & 0xff) << 0;
    result |= (buffer.get() & 0xff) << 8;
    return result;
  }
}
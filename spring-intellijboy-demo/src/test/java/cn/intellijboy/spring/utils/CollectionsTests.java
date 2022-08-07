/**
 * Copyright (c) 2019-2029, wwww.intellijboy.cn (liuburu@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package cn.intellijboy.spring.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 描述：集合测试
 *
 * @author IntelliJBoy
 * @since jdk1.8
 */
@DisplayName("集合测试")
public class CollectionsTests {

	@DisplayName("Map转集合")
	@Test
	public void testMap2Set() {
		Set<String> alreadyCreated = Collections.newSetFromMap(new ConcurrentHashMap<>(256));
		alreadyCreated.add("employ");
		alreadyCreated.add("dept");
		System.out.println(alreadyCreated);
	}
}
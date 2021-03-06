/*
 * Copyright 2013-2018 the original author or authors.
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

package org.springframework.cloud.r4j.core;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;

/**
 * @author Ryan Baxter
 */
public interface R4JConfigFactory {

	public CircuitBreakerConfig getCircuitBreakerConfig(String id);

	public TimeLimiterConfig getTimeLimiterConfig(String id);

	public CircuitBreakerConfig getDefaultCircuitBreakerConfig();

	public static class DefaultR4JConfigFactory implements R4JConfigFactory {

		@Override
		public CircuitBreakerConfig getCircuitBreakerConfig(String id) {
			return CircuitBreakerConfig.ofDefaults();
		}

		@Override
		public TimeLimiterConfig getTimeLimiterConfig(String id) {
			return TimeLimiterConfig.ofDefaults();
		}

		@Override
		public CircuitBreakerConfig getDefaultCircuitBreakerConfig() {
			return CircuitBreakerConfig.ofDefaults();
		}
	}
}

/*
 * Copyright (C) 2017 Uriel Sarrazin
 *
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

package com.urielsarrazin.spring.boot.micro.service.calculator.service.impl;

import com.urielsarrazin.spring.boot.micro.service.calculator.service.CalculatorService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CalculatorServiceImpl implements CalculatorService {

    @Scheduled(cron = "0/10 * * * * *")
    public void calculate() {

        final double result = Math.random() + Math.random();

        System.out.print(String.format("the sum of two random numbers : %f\n", result));
    }
}

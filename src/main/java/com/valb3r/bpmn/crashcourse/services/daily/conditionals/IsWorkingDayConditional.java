package com.valb3r.bpmn.crashcourse.services.daily.conditionals;

import org.flowable.engine.runtime.Execution;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Set;

@Service
public class IsWorkingDayConditional {

    public boolean isWeekend(Execution execution) {
        return Set.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY).contains(LocalDate.now().getDayOfWeek());
    }
}

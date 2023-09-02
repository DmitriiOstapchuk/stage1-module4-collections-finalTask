package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessons = new HashSet<>();
        Iterator<String> iterator = timetable.keySet().iterator();
        while(iterator.hasNext()) {
            List<String> lessonsForADay = timetable.get(iterator.next());
            for(String lesson : lessonsForADay) {
                lessons.add(lesson);
            }
        }
        return lessons;
    }
}

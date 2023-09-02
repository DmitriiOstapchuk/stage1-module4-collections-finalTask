package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        Comparator<String> projectComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length())
                    return o2.compareTo(o1);
                else
                    return o2.length()-o1.length();
            }
        };
        List<String> projectsOfDeveloper = new ArrayList<>();
        Set<String> setOfProjects = projects.keySet();
        for (String project : setOfProjects) {
            Set<String> developers = projects.get(project);
            if (developers.contains(developer))
                projectsOfDeveloper.add(project);
        }
        projectsOfDeveloper.sort(projectComparator);
        return projectsOfDeveloper;
    }


}

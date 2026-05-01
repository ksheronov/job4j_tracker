package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int count = 0;
        double scores = 0.0;
        for (Pupil pipil : pupils) {
            for (Subject subject : pipil.subjects()) {
                scores += subject.score();
                count++;
            }
        }
        return count == 0 ? 0D : scores / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pipil : pupils) {
            double count = 0.0;
            for (Subject subject : pipil.subjects()) {
                count += subject.score();
            }
            double score = count / pipil.subjects().size();
            result.add(new Label(pipil.name(), score));
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> result = new ArrayList<>();
        for (Pupil pipil : pupils) {
            for (Subject subject : pipil.subjects()) {
                map.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(new Label(entry.getKey(), (double) entry.getValue() / pupils.size()));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pipil : pupils) {
            int count = 0;
            for (Subject subject : pipil.subjects()) {
                count += subject.score();
            }
            result.add(new Label(pipil.name(), count));

        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> result = new ArrayList<>();
        for (Pupil pipil : pupils) {
            for (Subject subject : pipil.subjects()) {
                map.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(new Label(entry.getKey(), (double) entry.getValue()));
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }
}

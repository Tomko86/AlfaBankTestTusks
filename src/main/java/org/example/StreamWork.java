package org.example;

import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StreamWork {

    private static List<Integer> listOfNumbers = List.of(3, 10, -12, 9, -5, 6, -3, 0);
    private static List<String> listOfNames = List.of("Архипов", "Обручев", "Петров", "Сидоров", "Афанасьев", "Улюкаев");

    private static Map<String, Boolean> map;

    public static void main(String[] args) {
        System.out.println(listOfNumbers);
        invertNegative(listOfNumbers);
        evenOdd(listOfNumbers);
        List<String> listOfNamesNew = modifyList(listOfNames);
        System.out.println(listOfNamesNew);
        System.out.println(sumOfPositive(listOfNumbers));
        reedJsonFile();
        checkFieldOfJSON(map);
    }

    private static void checkFieldOfJSON(Map<String, Boolean> mapJSON) {
        boolean isPopular = mapJSON.entrySet()
                .stream()
                .filter(x -> x.getKey().equals("isPopular"))
                .allMatch(x -> x.getValue().equals(true));
        if (isPopular)
            System.out.println("Good");
        else
            System.out.println("Bad");
    }

    private static void reedJsonFile() {
        File file = new File("src/main/resources/file.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            map = objectMapper.readValue(file, new TypeReference<Map<String, Boolean>>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Integer sumOfPositive(List<Integer> listOfNumbers) {
        Optional<Integer> reduce = listOfNumbers.stream()
                .filter(number -> number > 0)
                .reduce(Integer::sum);
        return reduce.get();
    }

    private static List<String> modifyList(List<String> names) {
        return names.stream()
                .filter(name -> name.charAt(0) == 'А')
                .toList();
    }

    private static void invertNegative(List<Integer> list) {
        List<Integer> collect = list.stream()
                .map(number -> {
                    if (number < 0)
                        return number * (-1);
                    else
                        return number;
                })
                .toList();
        System.out.println(collect);
    }

    private static void evenOdd(List<Integer> list) {
        List<Integer> collect = list.stream()
                .map(number -> {
                    if (number % 2 == 0)
                        return number * 100;
                    else
                        return number - 100;
                })
                .toList();
        System.out.println(collect);
    }
}

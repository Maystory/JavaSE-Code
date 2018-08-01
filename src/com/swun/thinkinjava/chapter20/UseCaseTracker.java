package com.swun.thinkinjava.chapter20;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Objects.isNull;

/**
 * Created by Maven on 2018/8/1.
 * Description:
 */
public class UseCaseTracker {

    public static void trackUsecases(List<Integer> useCases, Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            UserCase userCaseAnno = method.getAnnotation(UserCase.class);
            if (!isNull(userCaseAnno)) {
                System.out.println(" usecaseAnno is :" + userCaseAnno.id() + "," + userCaseAnno.description());
                useCases.remove(new Integer(userCaseAnno.id()));

            }
        }
        for (Integer useCase : useCases) {
            System.out.println("missing useCase :" + useCase);
        }


    }

    public static void main(String[] args) {
        ArrayList<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases,11,12,88,99);
        trackUsecases(useCases,PasswordUtils.class);
    }
}
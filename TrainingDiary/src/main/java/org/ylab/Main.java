package org.ylab;

import org.ylab.access.model.Person;
import org.ylab.access.dao.PersonDAO;
import org.ylab.dao.TrainDAO;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person;
        TrainDAO trainDAO = new TrainDAO();
        PersonDAO personDAO = new PersonDAO();
        String username;
        String password;
        String role;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветствует Training Diary");
        System.out.println("Введите имя пользователя: ");
        username = scanner.nextLine();
        System.out.println("Введите пароль: ");
        password = scanner.nextLine();
        List<Person> list = personDAO.getList();

        boolean userSearchFlag= false;//вынести в класс autorization как отдельный метод
        for(Person per :list){
            String realUsername = per.getUsername();
            String realPassword = per.getPassword();
            if(username.equals(realUsername) && password.equals(realPassword)){
                System.out.println("Добро пожаловать, " + per.getName());
                System.out.println("Ваш уровень доступа: " + per.getRole());
                role = per.getRole();
                userSearchFlag=true;
                break;
            }
        }
        if(!userSearchFlag){
            System.out.println("Не найден пользователь");
        }
        // ДЛЯ АДМИНА
        // ПОКАЗАТЬ ВСЕ ТРЕНИРОВКИ
        // ДОБАВИТЬ ТРЕНИРОВКУ
        //УДАЛИТЬ ТРЕНИРОВКУ


        //ДЛЯ ПОЛЬЗОВАТЕЛЯ
        //НАЧАТЬ ТРЕНИРОВКУ (ТОЛЬКО ОДИН РАЗ В ДЕНЬ)
        //ИНИЦИАЛИЗИРУЕМ ДАТУ В ЭТОТ ДЕНЬ. ЗАПУСКАЕМ ТРЕНИРОВКУ
        //ПРИ ПОПЫТКЕ ПОВТОРНОГО ЗАПУСКА СРАВНИВАЕМ ДАТУ ИНИЦИАЛИЗИРОВАННУЮ И ТЕКУЩЕГО ДНЯ System.currentDate();


    }
}

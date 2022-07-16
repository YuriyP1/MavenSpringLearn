package ua.pevzner;

import ua.pevzner.dao.PersonDAO;

public class Test {

    public static void main(String[] args) {

        PersonDAO personDAO = new PersonDAO();
        System.out.println(personDAO.getPerson(2));
        System.out.println(personDAO.getPeopleList());
    }
}

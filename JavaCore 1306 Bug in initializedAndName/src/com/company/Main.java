package com.company;

/*

1306 Bug in initializedAndName
1. Think about what is wrong with the program.
2. Put the implementation of the initializeIdAndName method into the User class.
3. initializeIdAndName in the User class should return a User type.
4. Correct the program to compile and work.
Requirements:
1. The DBObject interface should contain only the declaration of the initializeIdAndName method without implementation.
2. Implement the initializeIdAndName method in the User class.
3. The initializeIdAndName method in the User class must be of the type returned by the User.
4. The initializeIdAndName method must assign values to the id and name fields in accordance with the parameters passed to it.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    interface DBObject {
        User initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("User has name %s, id = %d", name, id);
        }

        @Override
        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }
    }

}


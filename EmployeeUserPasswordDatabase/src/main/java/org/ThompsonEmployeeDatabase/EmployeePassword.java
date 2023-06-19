/*
    Created a record java file that contains the emailUserName and password variables that are
    passed into the record EmployeePassword arguments. This record is used for holding data that
    is all. This record includes a no-args Constructor and get methods, which uses less code.
    The developer can override the constructor method and add other methods within the record to
    be called. To call the get methods in a record, don't use getEmailUserName() or getPassword().
    You use emailUserName() and password().

    Created by: Eric Thompson
    Updated: June 19, 2023
 */

package org.ThompsonEmployeeDatabase;

public record EmployeePassword (String emailUserName, String password){ } // default no args constructor

package com.inherito.test.invoice;

public class Client {

        public Client(String firstName, String surname, String postal, String postalNumber, String streat) {
            this.firstName = firstName;
            this.surname = surname;
            this.postal = postal;
            this.postalNumber = postalNumber;
            this.streat = streat;
        }

        private String firstName;
        private String surname;

        private String postal;
        private String postalNumber;
        private String streat;

        public String getFirstName() {
            return firstName;
        }

        public String getPostal() {
            return postal;
        }

        public String getPostalNumber() {
            return postalNumber;
        }

        public String getStreat() {
            return streat;
        }

        public String getSurname() {
            return surname;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setPostal(String postal) {
            this.postal = postal;
        }

        public void setPostalNumber(String postalNumber) {
            this.postalNumber = postalNumber;
        }

        public void setStreat(String streat) {
            this.streat = streat;
        }

        public void setFirstSurname(String firstSurname) {
            this.surname = firstSurname;
        }
    }


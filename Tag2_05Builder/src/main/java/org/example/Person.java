package org.example;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    @Builder.Default
    private String anrede="Mister";

    @Builder.Default
    private String vorname="John";

    @Builder.Default
    private String nachname="Doe";

//   public static PersonBuilder builder() {
//       return new PersonBuilder();
//   }
//
//    public static class PersonBuilder {
//        private Person person=new Person();
//
//        public PersonBuilder anrede(String anrede) {
//            person.setAnrede(anrede);
//            return this;
//        }
//
//        public PersonBuilder vorname(String vorname) {
//            person.setVorname(vorname);
//            return this;
//        }
//        public PersonBuilder nachname(String nachname) {
//            person.setNachname(nachname);
//            return this;
//        }
//
//        public Person build() {
//            return person;
//        }
//    }


}

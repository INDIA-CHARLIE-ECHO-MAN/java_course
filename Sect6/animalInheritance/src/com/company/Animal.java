package com.company;

public class Animal {
        private int brain;
        private int body;
        private int weight;
        private int size;
        private String name;

        public Animal(int brain, int body, int weight, int size, String name) {
                this.brain = brain;
                this.body = body;
                this.weight = weight;
                this.size = size;
                this.name = name;
        }

        public void eat() {
                System.out.println("Animal started eating");
        }
        public void move(int speed) {
                System.out.println("Animal was moving at " + speed + " speed.");
        }

        public int getBrain() {
                return brain;
        }

        public int getBody() {
                return body;
        }

        public int getWeight() {
                return weight;
        }

        public int getSize() {
                return size;
        }

        public String getName() {
                return name;
        }
}

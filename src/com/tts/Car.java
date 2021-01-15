package com.tts;

public class Car {
    public  Car {
        private String make, model;
        private int manufacturingYear;

        public Car() {
            make = "";
            model = "";
            manufacturingYear = 2010;
        }

        public Car(String make, String model) {
            this.make = make;
            this.model = model;
            manufacturingYear = 2010;
        }

        public Car(String make, String model, int manufacturingYear) {
            this.make = make;
            this.model = model;
            this.manufacturingYear = manufacturingYear;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getManufacturingYear() {
            return manufacturingYear;
        }

        public void setManufacturingYear(int manufacturingYear) {
            this.manufacturingYear = manufacturingYear;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "make='" + make + '\'' +
                    ", model='" + model + '\'' +
                    ", manufacturingYear=" + manufacturingYear +
                    '}';
        }

        public boolean isNewCar() {
            return manufacturingYear >= 2020;
        }
    }
}

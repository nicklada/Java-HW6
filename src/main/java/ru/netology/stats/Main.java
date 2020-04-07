package ru.netology.stats;

public class Main {
        public static void main(int [] sales) {
            StatsService service = new StatsService();
            int sum = service.calculateSum(sales);
            int average = service.calculateAverage(sales);
            int numberMaxMonth = service.findMax(sales);
            int numberMinMonth = service.findMin(sales);
            int summore = service.moreAverage(sales);
            int sumless = service.lessAverage(sales);


            System.out.print(sum);
            System.out.print(average);
            System.out.print(numberMaxMonth);
            System.out.print(numberMinMonth);
            System.out.print(summore);
            System.out.print(sumless);

        }
    }


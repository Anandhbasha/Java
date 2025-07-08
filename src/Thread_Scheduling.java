public class Thread_Scheduling {
        public static void main(String[] args) {
            // Create orders (tasks) for the kitchen
            String[] orders = {
                    "Pasta - 3 mins", "Steak - 5 mins", "Salad - 2 mins",
                    "Soup - 4 mins", "Dessert - 6 mins"
            };

            // Create cooks (threads)
            for (int i = 0; i < orders.length; i++) {
                Thread cook = new Thread(new Cook(orders[i]), "Cook " + (i+1));
                cook.start(); // Start each cook thread
//new cook("Pasta","cook1")
//new cook("Steak","cook2")
//new cook("Salad","cook3")
//new cook("Soup","cook4")
//new cook("Dessert","cook5")
            }
        }
    }

    class Cook implements Runnable {
        private String order;

        public Cook(String order) {
            this.order = order;
        }

//        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() +
                    " starts preparing: " + order.split(" - ")[0]);

            try {
                // Simulate time to prepare the dish
                int prepTime = Integer.parseInt(order.split(" - ")[1].replace(" mins", ""));
                Thread.sleep(prepTime * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() +
                    " finished: " + order.split(" - ")[0]);
        }
}

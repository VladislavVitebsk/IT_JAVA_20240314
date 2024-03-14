package IT_JAVA_20240314;

import java.util.ArrayList;
import java.util.List;
public class ChildListenerMom {


// Интерфейс слушателя interface ChildListener { void onCry(); }

    class Child { private List<ChildListener> listeners = new ArrayList<>();


        // Добавление слушателя
        public void addListener(ChildListener listener) {
            listeners.add(listener);
        }

        // Метод, вызываемый при плаче ребенка
        public void cry() {
            System.out.println("Child is crying...");
            // Уведомление слушателей
            for (ChildListener listener : listeners) {
                listener.onCry();
            }
        }
    }

    class Mom implements ChildListener {
        @Override
        public void onCry() {
            System.out.println("Mom is listening to the child crying...");
        }
    }

    public class Main { public static void main(String[] args) { Child child = new Child(); Mom mom = new Mom();


        // Мама слушает ребенка
        child.addListener(mom);

        // Ребенок начинает плакать
        child.cry();
    }
    }
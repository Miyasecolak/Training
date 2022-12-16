package P_tesi_S_1;

public class S_6Mountain {
    public static void main(String[] args) {

        int[] x1={0, 2, 5, 3, 1};
        int[] x2={5, 2, 7, 1, 4};
        System.out.println("x1 Mountain Array midir "+mountainArray(x1,x1.length));
        System.out.println("x2 Mountain Array midir "+mountainArray(x2,x2.length));


    }
        static boolean mountainArray(int X[], int n)
        {
            int climb = 0;
            while (climb < n - 1 && X[climb] < X[climb + 1])
                climb = climb + 1;

            if (climb == 0 || climb == n-1)
                return false;

            while (climb < n - 1 && X[climb] > X[climb + 1])
                climb = climb + 1;

            if (climb == n - 1)
                return true;
            else
                return false;
        }
    }


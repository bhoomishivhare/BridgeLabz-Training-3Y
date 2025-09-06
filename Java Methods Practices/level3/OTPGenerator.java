import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {

    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000); // 6-digit OTP
    }

    public static boolean areUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];
        System.out.print("Generated OTPs: ");
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.print(otpArray[i] + " ");
        }
        System.out.println("\nAre all OTPs unique? " + areUnique(otpArray));
    }
}

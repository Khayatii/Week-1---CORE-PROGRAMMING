public class OTPGeneration {
    public static void main(String[] args) {
        PrintOtp(StoreOTP());
        if (isUnique(StoreOTP())) {
            System.out.println("All the OTPs are Unique");
        } else {
            System.out.println("OTPs are not Unique");
        }
    }

    public static int generateOTP() {
        return 100000 + (int) (Math.random() * 900000);
    }

    public static int[] StoreOTP() {
        int[] otpArray = new int[10];
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }
        return otpArray;
    }

    public static void PrintOtp(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            System.out.println("The OTPs are");
            System.out.println(otpArray[i]);
        }
    }

    public static boolean isUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
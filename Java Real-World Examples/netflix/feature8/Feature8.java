package netflix.feature8;

public class Feature8 {

    public static void main(String[] args){

        ValidateUserSession validateUserSession = new ValidateUserSession();

        System.out.println(validateUserSession.validate(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 2, 5, 3, 6, 7, 4}));
        System.out.println(validateUserSession.validate(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 2, 5, 3, 6, 7, 4}));
        System.out.println(validateUserSession.validate(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1}));
    }
}

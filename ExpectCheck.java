class ExpectCheck {

    private int val;

    public ExpectCheck(int val) {
        this.val = val;
    }

    public boolean toBe(int value) {
        if (this.val == value) {
            return true;
        } else {
            throw new RuntimeException("Not Equal");
        }
    }

    public boolean notToBe(int value) {
        if (this.val != value) {
            return true;
        } else {
            throw new RuntimeException("Equal");
        }
    }

    public static ExpectCheck expect(int val) {
        return new ExpectCheck(val);
    }

    public static void main(String[] args) {
        try {
            System.out.println(expect(5).toBe(5)); 
            System.out.println(expect(5).notToBe(3)); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
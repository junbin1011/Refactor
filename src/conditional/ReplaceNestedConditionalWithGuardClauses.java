package conditional;

public class ReplaceNestedConditionalWithGuardClauses {
    boolean isDead = false;
    boolean isSeparated = false;
    boolean isRetired = false;

    boolean sample() {
        boolean result;
        if (isDead)
            result = deadAmount();
        else {
            if (isSeparated)
                result = separatedAmount();
            else {
                if (isRetired)
                    result = retiredAmount();
                else
                    result = normalPayAmount();
            }
        }
        return result;
    }

    boolean refactor() {
        if (isDead) return deadAmount();
        if (isSeparated) return separatedAmount();
        if (isRetired) return retiredAmount();
        return normalPayAmount();
    }

    private boolean deadAmount() {
        return true;
    }

    private boolean separatedAmount() {
        return true;
    }

    private boolean retiredAmount() {
        return true;
    }

    private boolean normalPayAmount() {
        return true;
    }
}

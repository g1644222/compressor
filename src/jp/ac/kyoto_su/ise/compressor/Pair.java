package jp.ac.kyoto_su.ise.compressor;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class Pair<L, R> {
    private L left;
    private R right;

    public void accept(BiConsumer<L, R> action) {
        action.accept(left, right);
    }

    public Pair<R, L> swap() {
        return Pair.of(right, left);
    }

    public <T> T map(BiFunction<L, R, T> function) {
        return function.apply(left, right);
    }

    public <LL, RR> Pair<LL, RR> map(Function<L, LL> leftFunc, Function<R, RR> rightFunc) {
        return of(leftFunc.apply(left), rightFunc.apply(right));
    }

    public boolean test(BiPredicate<L, R> condition) {
        return condition.test(left, right);
    }

    public static <L, R> Pair<L, R> of(@NotNull L left, @NotNull R right) {
        return new Pair<>(left, right);
    }

    private Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }
}

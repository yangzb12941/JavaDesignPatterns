package InterpreterPattern;

/**
 * 我们将创建一个接口 Expression 和实现了 Expression 接口的实体类。
 * 定义作为上下文中主要解释器的 TerminalExpression 类。
 * 其他的类 OrExpression、AndExpression 用于创建组合式表达式。
 *
 * InterpreterPatternDemo，我们的演示类使用 Expression 类创建规则和演示表达式的解析。
 */
public interface Expression {
    public boolean interpret(String context);
}

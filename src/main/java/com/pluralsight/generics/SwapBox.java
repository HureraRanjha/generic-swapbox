package com.pluralsight.generics;

public class SwapBox<T>
{
    private T leftItem;
    private T rightItem;

    public SwapBox(T leftItem, T rightItem)
    {
        this.leftItem = leftItem;
        this.rightItem = rightItem;
    }

    public T getLeftItem()
    {
        return leftItem;
    }

    public void setLeftItem(T leftItem)
    {
        this.leftItem = leftItem;
    }

    public T getRightItem()
    {
        return rightItem;
    }

    public void setRightItem(T rightItem)
    {
        this.rightItem = rightItem;
    }

    public void swap()
    {
        T temp = this.leftItem;
        this.leftItem = rightItem;
        this.rightItem = temp;
    }

    public String describe()
    {
        return "Left: " + leftItem + ", Right: " + rightItem;
    }

    public boolean itemsMatch()
    {
        return this.leftItem.equals(this.rightItem);
    }

}

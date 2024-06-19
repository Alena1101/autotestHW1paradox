package com.alena;

public class Door {
    public void setHasPrize(boolean hasPrize) {
        this.hasPrize = hasPrize;
    }

    private boolean hasPrize;
    private boolean isSelected;
    private boolean isHint;

    public boolean isHint() {
        return isHint;
    }

    public void setHint(boolean hint) {
        isHint = hint;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean open(){
        if (hasPrize){
            System.out.println("Да, за этой дверью приз!");
        } else {
            System.out.println("Нет, к сожалению за этой дверью нет приза!");
        }
        return hasPrize;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Door{");
        sb.append("hasPrize=").append(hasPrize);
        sb.append(", isSelected=").append(isSelected);
        sb.append('}');
        return sb.toString();
    }

    public Door(boolean hasPrize) {
        this.hasPrize = hasPrize;
    }

    public boolean hasPrize() {
        return hasPrize;
    }


}

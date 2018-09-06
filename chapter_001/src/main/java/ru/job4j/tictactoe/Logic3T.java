package ru.job4j.tictactoe;

public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        boolean result = true;
        for (int index = 0; index != table.length - 1; index++) {
            if (table[0][0] != table[index][index]) {
                result = false;
                break;
            }
            if (table[table.length - 1][0] != table[table.length - 2 - index][index + 1]) {
                result = false;
                break;
            }
            if (table[0][0] != table[0][index]) {
                result = false;
                break;
            }
            if (table[0][0] != table[index][0]) {
                result = false;
                break;
            }
            if (table[1][0] != table[1][index]) {
                result = false;
                break;
            }
            if (table[0][1] != table[index][1]) {
                result = false;
                break;
            }
            if (table[2][0] != table[2][index]) {
                result = false;
                break;
            }
            if (table[0][2] != table[index][2]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean isWinnerO() {
        boolean result = true;
        for (int index = 0; index != table.length - 1; index++) {
            if (table[0][0] != table[index][index]) {
                result = false;
                break;
            }
            if (table[table.length - 1][0] != table[table.length - 2 - index][index + 1]) {
                result = false;
                break;
            }
            if (table[0][0] != table[0][index]) {
                result = false;
                break;
            }
            if (table[0][0] != table[index][0]) {
                result = false;
                break;
            }
            if (table[1][0] != table[1][index]) {
                result = false;
                break;
            }
            if (table[0][1] != table[index][1]) {
                result = false;
                break;
            }
            if (table[2][0] != table[2][index]) {
                result = false;
                break;
            }
            if (table[0][2] != table[index][2]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean hasGap() {
        boolean result = false;
        for (int index = 0; index != table.length - 1; index++) {
            if (table[0][0] != table[index][index]) {
                result = true;
                break;
            }
            if (table[table.length - 1][0] != table[table.length - 2 - index][index + 1]) {
                result = true;
                break;
            }
            if (table[0][0] != table[0][index]) {
                result = true;
                break;
            }
            if (table[0][0] != table[index][0]) {
                result = true;
                break;
            }
            if (table[1][0] != table[1][index]) {
                result = true;
                break;
            }
            if (table[0][1] != table[index][1]) {
                result = true;
                break;
            }
            if (table[2][0] != table[2][index]) {
                result = true;
                break;
            }
            if (table[0][2] != table[index][2]) {
                result = true;
                break;
            }
        }
        return result;
    }
}

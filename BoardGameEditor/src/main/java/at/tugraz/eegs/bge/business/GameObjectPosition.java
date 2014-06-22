/*
 * Copyright (C) 2014 Lucas Reeh <lreeh@tugraz.at>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package at.tugraz.eegs.bge.business;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author Lucas Reeh <lreeh@tugraz.at>
 */
public class GameObjectPosition {

    private Double x = 0.0;
    private Double y = 0.0;
    private Double z = 0.0;

    public GameObjectPosition() {
    }

    public GameObjectPosition(Double x, Double z) {
        this.x = x;
        this.z = z;
    }

    public GameObjectPosition(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getTranslation() {
        StringBuilder sb = new StringBuilder();
        DecimalFormat formatter = new DecimalFormat("####0.00000", new DecimalFormatSymbols(Locale.ENGLISH));
        sb.append(formatter.format(x));
        sb.append(" ");
        sb.append(formatter.format(z));
        sb.append(" ");
        sb.append(formatter.format(y));
        return sb.toString();
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

}

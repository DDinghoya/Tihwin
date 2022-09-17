/*
    Copyright 2022 Dmitry Isaenko

    This file is part of Tihwin.

    Tihwin is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Tihwin is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Tihwin.  If not, see <https://www.gnu.org/licenses/>.
 */
package tihwin;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesHelper {
    public static String getRealFolder(String location){
        try{
            Path locationAsPath = Paths.get(location);
            if (Files.notExists(locationAsPath) || Files.isRegularFile(locationAsPath))
                return System.getProperty("user.home");
            return location;
        }
        catch (Exception ignored){
            return System.getProperty("user.home");
        }
    }

}

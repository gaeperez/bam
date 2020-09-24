package es.uvigo.ei.sing.singulator.gui.custom.filters;

import java.io.File;

import javax.swing.ImageIcon;

import com.alee.managers.language.LanguageManager;
import com.alee.utils.FileUtils;
import com.alee.utils.filefilter.AbstractFileFilter;

import es.uvigo.ei.sing.singulator.gui.constant.Constants;
import es.uvigo.ei.sing.singulator.gui.constant.Functions;

public class JsonFilesFilter extends AbstractFileFilter {

	public static final ImageIcon ICON = Functions.loadIcon(Constants.ICON_JSON_16);

	@Override
	public boolean accept(File file) {
		return FileUtils.getFileExtPart(file.getName().toLowerCase(), false).equals(Constants.FILTER_JSON);
	}

	@Override
	public String getDescription() {
		return LanguageManager.get(Constants.FILTER_JSON_DESCRIPTION);
	}

	@Override
	public ImageIcon getIcon() {
		return ICON;
	}

}

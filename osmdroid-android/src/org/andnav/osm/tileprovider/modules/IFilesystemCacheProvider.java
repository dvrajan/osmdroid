package org.andnav.osm.tileprovider.modules;

import org.andnav.osm.tileprovider.renderer.IOpenStreetMapRendererInfo;

public interface IFilesystemCacheProvider {
	IFilesystemCache registerRendererForFilesystemAccess(
			IOpenStreetMapRendererInfo pRendererInfo, int minimumZoomLevel,
			int maximumZoomLevel);

	void unregisterRendererForFilesystemAccess(
			IOpenStreetMapRendererInfo pRendererInfo);
}
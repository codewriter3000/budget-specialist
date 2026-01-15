# Run Liberty in dev mode for hot reload
# This runs locally, not in Docker, for instant hot reload

Write-Host "Starting Liberty in dev mode with hot reload..."
Write-Host "Access app at: http://localhost:9080/budget-specialist"
Write-Host ""
Write-Host "Hot reload is enabled:"
Write-Host "- Edit .xhtml or Java files and save"
Write-Host "- Changes will be detected and reloaded automatically"
Write-Host "- Press Ctrl+C to stop"
Write-Host ""

./mvnw liberty:dev
